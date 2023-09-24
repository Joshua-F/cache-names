package org.runestar.cachenames

import java.nio.file.Path

fun main() {
    fun dump(output: Path, archive: Int) {
        writeLines(output, NAMES.filter { it.archive == archive && it.file == -1 && it.name != null }.map { "${it.group}\t${it.name}" })
    }

    fun dumpFile(output: Path, archive: Int) {
        writeLines(output, NAMES.filter { it.archive == archive && it.file != -1 && it.name != null }.map { "${(it.group shl 16) or it.file}\t${it.name}" })
    }

    dump(Path.of("interface-names.tsv"), 3)
    dumpFile(Path.of("component-names.tsv"), 3)
    dump(Path.of("song-names.tsv"), 6)
    dump(Path.of("graphic-names.tsv"), 8)
    dump(Path.of("script-names.tsv"), 12)
    dump(Path.of("fontmetrics-names.tsv"), 13)
}

