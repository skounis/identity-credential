package com.android.identity.wallet.util

data class Field(
    val id: Int,
    val label: String,
    val name: String,
    val fieldType: FieldType,
    val value: Any
)

enum class FieldType {
    STRING, DATE, BOOLEAN, BITMAP
}