package com.example.agrognom.data.tokenStorage

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import com.example.agrognom.data.dto.response.TokenResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class TokenStorage(
    private val dataStore: DataStore<Preferences>
) {

    companion object {
        val ACCESS = stringPreferencesKey("access_token")
        val REFRESH = stringPreferencesKey("refresh_token")
    }

    val accessToken: Flow<String?> = dataStore.data.map { it[ACCESS] }
    val refreshToken: Flow<String?> = dataStore.data.map { it[REFRESH] }

    suspend fun saveTokens(response: TokenResponse) {
        dataStore.edit { prefs ->
            prefs[ACCESS] = response.accessToken
            prefs[REFRESH] = response.refreshToken
        }
    }

    suspend fun clear() {
        dataStore.edit { it.clear() }
    }
}