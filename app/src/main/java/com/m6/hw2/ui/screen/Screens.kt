package com.m6.hw2.ui.screen

import com.m6.hw2.data.BookModel

sealed class Screens {

    data object Main : Screens()
    data class Detail(val book: BookModel) : Screens()
}