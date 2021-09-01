package org.runestar.cachenames

import java.nio.file.Files
import java.nio.file.Path

fun main() {
    val uniqueNameHashes = Files.readAllLines(Path.of("name-hashes.tsv")).mapTo(HashSet()) { it.split('\t').last().toInt() }

    val individualNames = Files.readAllLines(Path.of("individual-names.tsv")).toSortedSet()
    writeLines(Path.of("individual-names.tsv"), individualNames)

    val knownNames = ArrayList<String>(individualNames)

    fun String.add() {
        if (hashCode() in uniqueNameHashes) {
            knownNames.add(this)
        }
    }

    for (x in 0..275) {
        for (y in 0..255) {
            "m${x}_$y".add()
            "l${x}_$y".add()
            "e${x}_$y".add()
            "standard_charge_$y,$x".add()
            "standard_shield_$y,$x".add()
            "standard_health_$y,$x".add()
            "standard_armour_$y,$x".add()
        }
        "emotes,$x".add()
        "emotes_locked,$x".add()
        "tabs,$x".add()
        "orb_xp,$x".add()
        "reset,$x".add()
        "options_radio_buttons,$x".add()
        "zeah_book,$x".add()
        "magicon,$x".add()
        "magicon2,$x".add()
        "combaticons,$x".add()
        "combaticons2,$x".add()
        "combaticons3,$x".add()
        "hitmark,$x".add()
        "peng_emotes,$x".add()
        "staticons,$x".add()
        "staticons2,$x".add()
        "barbassault_icons,$x".add()
        "orb_icon,$x".add()
        "options_icons,$x".add()
        "options_slider,$x".add()
        "ge_icons,$x".add()
        "warning_icons,$x".add()
        "close_buttons,$x".add()
        "side_icons,$x".add()
        "steelborder,$x".add()
        "steelborder2,$x".add()
        "arrow,$x".add()
        "magicoff,$x".add()
        "magicoff2,$x".add()
        "miscgraphics,$x".add()
        "miscgraphics2,$x".add()
        "miscgraphics3,$x".add()
        "prayeroff,$x".add()
        "combatboxes,$x".add()
        "prayeron,$x".add()
        "mapfunction,$x".add()
        "sworddecor,$x".add()
        "wornicons,$x".add()
        "clickcross,$x".add()
        "worldmap_icon,$x".add()
        "bankbuttons,$x".add()
        "scrollbar_v2,$x".add()
        "scrollbar_dragger_v2,$x".add()
        "fast_forward,$x".add()
        "thumbs,$x".add()
        "checkbox,$x".add()
        "open_buttons,$x".add()
        "banktabs,$x".add()
        "options_boxes,$x".add()
        "mobile_stones,$x".add()
        "tabs_large,$x".add()
        "2x_standard_spells_on,$x".add()
        "2x_standard_spells_off,$x".add()
        "2x_lunar_spells_on,$x".add()
        "2x_lunar_spells_off,$x".add()
        "2x_ancient_spells_on,$x".add()
        "2x_ancient_spells_off,$x".add()
        "2x_necro_spells_on,$x".add()
        "2x_necro_spells_off,$x".add()
        "wint_icons,$x".add()
        "magic_necro_on,$x".add()
        "magic_necro_off,$x".add()
        "v2_stone_button,$x".add()
        "v2_stone_button_in,$x".add()
        "v2_stone_borders,$x".add()
        "med_buttons,$x".add()
        "lunar_magic_on,$x".add()
        "lunar_magic_off,$x".add()
        "achievement_diary_icons,$x".add()
        "ii_impling_icons,$x".add()
        "orb_filler,$x".add()
        "windowmode_icons,$x".add()
        "ge_smallicons,$x".add()
        "sideicons_new,$x".add()
        "options_icons_small,$x".add()
        "gnomeball_buttons,$x".add()
        "orb_frame,$x".add()
        "poh_doors,$x".add()
        "banktabs_small,$x".add()
        "ge_cancel,$x".add()
        "banktab_icons,$x".add()
        "orb_frame,$x".add()
        "sortarrows,$x".add()
        "clan_chat_buttons,$x".add()
        "tabs_split,$x".add()
        "scrollbar_sep,$x".add()
        "oge_images,$x".add()
        "oge_title,$x".add()
        "close_buttons_v2,$x".add()
        "pvpw_icons,$x".add()
        "sideicons_interface,$x".add()
        "miscgraphics4,$x".add()
        "cross_interface,$x".add()
        "red_green_arrows,$x".add()
        "worldmap_icon_large,$x".add()
        "steelborder_close_button,$x".add()
        "headicons_pk_interface,$x".add()
        "mapdots_interface,$x".add()
        "clan_chat_icons,$x".add()
        "combatboxesmed,$x".add()
        "combatboxes_large,$x".add()
        "combatboxes_split,$x".add()
        "worldswitcher_flags,$x".add()
        "worldswitcher_stars,$x".add()
        "worldmap_marker,$x".add()
        "deadman_deathtype,$x".add()
        "combat_autoretaliate,$x".add()
        "stoneborder_close_button,$x".add()
        "v2_stone_close_button,$x".add()
        "v2_stone_button_out,$x".add()
        "options_slider_five,$x".add()
        "scrollbar_parchment_v2,$x".add()
        "scrollbar_parchment_dragger_v2,$x".add()
        "scrollbar_trans_arrows,$x".add()
        "scrollbar_trans_dragger,$x".add()
        "v2_borders_slim,$x".add()
        "v2_stone_borders_alt,$x".add()
        "favourite_icons,$x".add()
        "mod_icons_interface,$x".add()
        "spectator,$x".add()
        "gauntlet_map_icons,$x".add()
        "armour_100,$x".add()
        "combatboxes_very_large,$x".add()
        "side_stone_highlights,$x".add()
        "dashed_border,$x".add()
        "menu_buttons,$x".add()
        "league_relics,$x".add()
        "tabs_tall,$x".add()
        "tabs_short,$x".add()
        "square_button,$x".add()
        "league_progress_bar,$x".add()
        "league_relics_large,$x".add()
        "open_buttons_small,$x".add()
        "poh_room_layouts,$x".add()
        "titlebutton_wide42,$x".add()
        "rightarrow_small_stone,$x".add()
        "poh_board_icons,$x".add()
        "league_task_tiers,$x".add()
        "league_relics_tli,$x".add()
        "wiki_icon,$x".add()
        "ap_border,$x".add()
        "tiny_combat_staticons,$x".add()
        "highlight_border,$x".add()
        "question_button,$x".add()
        "hud_brackets,$x".add()
        "square_button_large,$x".add()
        "rect_button,$x".add()
        "ap_path_banner,$x".add()
        "ap_path_icon,$x".add()
        "steelborder_divider,$x".add()
        "league_relics_outline,$x".add()
        "league_tiny_relic,$x".add()
        "league_tutorial,$x".add()
        "trailblazer_relics_large,$x".add()
        "trailblazer_relics,$x".add()
        "trailblazer_relics_tli,$x".add()
        "trailblazer_progress_bar,$x".add()
        "trailblazer_map_shields,$x".add()
        "trailblazer_map_shields_large,$x".add()
        "trailblazer_map_names,$x".add()
        "settings_tabs,$x".add()
        "ame_confirm_button,$x".add()
        "stony_basalt,$x".add()
        "icy_basalt,$x".add()
        "toggle_box,$x".add()
        "settings_slider,$x".add()
        "soul_wars_staticons,$x".add()
        "report_button,$x".add()
        "clan_rank_icons,$x".add()
        "scrollbar_v2_dark,$x".add()
        "scrollbar_dragger_v2_dark,$x".add()
        "chatchannel_rank_icons,$x".add()
        "chat_tab_button,$x".add()
        "chat_type_icon,$x".add()
        "account_icons,$x".add()
        "deadman_sigil_icons,$x".add()
        "deadman_sigil_icons_tli,$x".add()
        "deadman_sigil_skulls,$x".add()
        "ca_progress_bar,$x".add()
        "ca_tier_swords,$x".add()
    }

    knownNames.remove("l16_186")
    knownNames.remove("l193_196")

    val knownNamesMap = knownNames.associateBy { it.hashCode() }

    val fullNames = Files.readAllLines(Path.of("name-hashes.tsv")).map { line ->
        val hash = line.split('\t').last().toInt()
        val name = knownNamesMap.getOrDefault(hash, "")
        "$line\t$name"
    }
    writeLines(Path.of("names.tsv"), fullNames)
}