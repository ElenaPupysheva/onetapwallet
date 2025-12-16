package com.alonso.onetapwallet.utils

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.alonso.onetapwallet.ui.theme.PrimaryPurple
import com.alonso.onetapwallet.ui.theme.OnetapwalletTheme

@Composable
fun ColorText() {
    Row {
        Text(
            text = "1Tap ",
            color = PrimaryPurple,
            style = MaterialTheme.typography.bodyLarge
        )
        Text(
            text = "Wallet",
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Preview (showBackground = true)
@Composable
fun textPreview() {
    OnetapwalletTheme {
        ColorText()
    }
}