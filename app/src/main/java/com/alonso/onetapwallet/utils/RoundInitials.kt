package com.alonso.onetapwallet.utils

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Circle
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.alonso.onetapwallet.data.User

@Composable
fun RoundInitials(initials: String) {
    Box(
        modifier = Modifier
            .size(48.dp)
            .padding(vertical = 8.dp),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Filled.Circle,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.surfaceVariant,
            modifier = Modifier.fillMaxSize()
        )
        Text(
            text = initials,
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )
    }
}

fun getInitials(user: User): String {
    val nameInitial = user.name.firstOrNull()?.uppercaseChar()
    val familyInitial = user.surname.firstOrNull()?.uppercaseChar()
    return listOfNotNull(nameInitial, familyInitial).joinToString("")
}
