package com.example.heartconnect.features.domain.repositories

import com.example.heartconnect.features.data.models.chat.ChatRequestModel
import com.example.heartconnect.features.data.models.conversation.ConversationModel
import com.example.heartconnect.features.data.models.feed.FeedModel
import com.example.heartconnect.features.data.models.message.MessageModel
import com.example.heartconnect.features.data.models.message.MessageRequestModel
import com.example.heartconnect.features.data.models.register.UserRegisterModel
import com.example.heartconnect.model.CommonResponseModel

interface UserRepository {
    suspend fun getHomeUsers(id: String): List<FeedModel>

    suspend fun getConversations(id: String): List<ConversationModel>

    suspend fun getMessages(messageRequestModel: MessageRequestModel): List<MessageModel>

    suspend fun sendMessage(messageRequestModel: MessageRequestModel): CommonResponseModel

    suspend fun createChat(chatRequestModel: ChatRequestModel): CommonResponseModel

    suspend fun registerUser(userRegisterModel: UserRegisterModel): CommonResponseModel

}