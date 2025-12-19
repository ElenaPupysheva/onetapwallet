package com.alonso.onetapwallet.ui.compose

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alonso.onetapwallet.data.User
import com.alonso.onetapwallet.ui.theme.OnetapwalletTheme
import com.alonso.onetapwallet.ui.theme.PrimaryBlack
import com.alonso.onetapwallet.ui.theme.PrimaryPurple
import com.alonso.onetapwallet.utils.FilledButton
import com.alonso.onetapwallet.utils.OutlinedButton
import com.alonso.onetapwallet.utils.RoundInitials
import com.alonso.onetapwallet.utils.getInitials

@Composable
fun HomepageScreen(user: User) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
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

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "Привет, ${user.name}",
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.titleLarge,
                maxLines = 2,
                textAlign = TextAlign.Left,
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFFFFF1D6),
                            Color(0xFFFFD6E8),
                            Color(0xFFD6ECFF)
                        ),
                        start = Offset(0f, 0f),
                        end = Offset.Infinite
                    ),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(16.dp)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Text(
                    text = "Current Balance",
                    color = PrimaryBlack,
                    style = MaterialTheme.typography.titleMedium,
                    maxLines = 1
                )

                Spacer(modifier = Modifier.height(12.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "$87,430.12",
                        color = PrimaryBlack,
                        style = MaterialTheme.typography.titleLarge,
                        maxLines = 1,
                        modifier = Modifier.weight(1f)
                    )

                    Spacer(modifier = Modifier.width(12.dp))

                    Text(
                        text = "↑ 10.2%",
                        color = PrimaryPurple,
                        style = MaterialTheme.typography.titleMedium,
                        maxLines = 1
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            FilledButton(
                text = "Deposit",
                onClick = { /* log */ },
                modifier = Modifier.weight(1f)
            )

            Spacer(modifier = Modifier.width(12.dp))

            OutlinedButton(
                text = "Withdraw",
                onClick = { /* log */ },
                modifier = Modifier.weight(1f)
            )
        }
        Spacer(modifier = Modifier.height(38.dp))
        Text(
            text = "Биржа",
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.titleLarge,
            maxLines = 1
        )
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn(modifier = Modifier
            .fillMaxWidth()) {


        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomepageScreenPreview() {
    OnetapwalletTheme {
        HomepageScreen(
            user = User(
                name = "Алиса",
                surname = "Петрова",
                imageRes = null
            )
        )
    }
}
