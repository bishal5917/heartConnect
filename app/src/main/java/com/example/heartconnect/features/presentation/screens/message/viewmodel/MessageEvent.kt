package com.example.heartconnect.features.presentation.screens.message.viewmodel

import com.example.heartconnect.features.data.models.message.MessageRequestModel

sealed class MessageEvent {
    data class GetMessages(val messageRequestModel: MessageRequestModel) : MessageEvent()
}