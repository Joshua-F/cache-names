package org.runestar.cachenames

import java.nio.file.Files
import java.nio.file.Path

private val TRIGGER_NAMES = mapOf(
    10 to "opworldmapelement1",
    11 to "opworldmapelement2",
    12 to "opworldmapelement3",
    13 to "opworldmapelement4",
    14 to "opworldmapelement5",
    15 to "worldmapelementmouseover",
    16 to "worldmapelementmouseleave",
    17 to "worldmapelementmouserepeat",
    35 to "loadnpc",
    37 to "loadloc",
    73 to "proc",
    76 to "clientscript",
)

fun main() {
    // find all script names that are missing
    val missingNames = Files.readAllLines(Path.of("names.tsv"))
        .map { it.split('\t') }
        .filter { it.first() == "12" && it.last().isEmpty() }
        .associate { it[3].toInt() to it[1].toInt() }

    val printed = HashSet<String>()
    for (trigger_id in 0..100) {
        for (type in -1..65535) {
            checkAndPrint(missingNames, printed, trigger_id, type, -1)
        }
        for (category in -1..2047) {
            checkAndPrint(missingNames, printed, trigger_id, -1, category)
        }
    }
}

private fun checkAndPrint(
    missingNames: Map<Int, Int>,
    printed: MutableSet<String>,
    trigger_id: Int,
    type: Int,
    category: Int
) {
    val names = getHashes(trigger_id, type, category)
    for (index in names.indices) {
        val triggerName = names[index]
        val triggerHash: Int = triggerName.hashCode()
        val match = missingNames[triggerHash]
        if (match != null) {
            var name = TRIGGER_NAMES[trigger_id]
            if (name == null) {
                name = "trigger_$trigger_id"
            }
            val scriptName = when (index) {
                2 -> "[$name,type_$type]"
                1 -> "[$name,_category_$category]"
                else -> "[$name,_]"
            }
            if (printed.add(triggerName)) {
                println("$triggerName: $match $scriptName")
            }
        }
    }
}

private fun getHashes(triggerId: Int, type: Int, category: Int): Array<String> {
    val hash1 = triggerId or (type shl 8)
    val hash2 = triggerId - (category + 3 shl 8)
    val hash3 = triggerId - 512
    return listOf(hash3, hash2, hash1)
        .map { it.toString() }
        .toTypedArray()
}
