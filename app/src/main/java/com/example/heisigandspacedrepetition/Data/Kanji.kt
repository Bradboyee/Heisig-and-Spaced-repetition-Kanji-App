package com.example.heisigandspacedrepetition.Data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Kanji (
    var Kanji: String = "",
    var Kname: String = "",
    var KStroke: Int = 0,
    var Kmeaning: String = "",
    var Kgrade: Int =0,
    var Kunyomi_ja: String="",
    var Kunyomi: String ="",
    var onyomi_ja: String ="",
    var onyomi: String ="",
    var radical: String ="",
    var rad_stroke: Int =0,
    var rad_name_ja: String ="",
    var rad_name: String ="",
    var rad_meaning: String ="",
    var rad_position_ja: String ="",
    var rad_position: String ="",
): Parcelable
