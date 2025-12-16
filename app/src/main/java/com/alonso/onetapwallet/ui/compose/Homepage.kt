package com.alonso.onetapwallet.ui.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.alonso.onetapwallet.data.User
import com.alonso.onetapwallet.utils.RoundInitials
import com.alonso.onetapwallet.utils.getInitials

@Composable
fun HomepageScreen(user: User) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (user.imageRes != null) {
            Image(
                painter = painterResource(id = user.imageRes),
                contentDescription = null,
                modifier = Modifier.size(48.dp)
            )
        } else {
            RoundInitials(getInitials(user))
        }
    }
    Spacer(modifier = Modifier.height(16.dp))
}


