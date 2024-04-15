package com.example.tetrissssss.helpers

fun array2dOfByte(sizeOuter: Int /*Количество строк*/, sizeInner: Int) : Array<ByteArray>
= Array(sizeOuter) {ByteArray(sizeInner)} //Создание двумерного массива байтов