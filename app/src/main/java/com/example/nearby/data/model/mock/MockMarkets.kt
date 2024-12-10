package com.example.nearby.data.model.mock

import com.example.nearby.data.model.Market

val mockMarkets = listOf(
    Market(
        id = "012576ea-4441-4b8a-89e5-d5f32104c7c4",
        categoryId = "146b1a88-b3d3-4232-8b8f-c1f006f1e86d",
        name = "Sabor Grill",
        description = "Churrascaria com cortes nobres e buffet variado. Experiência completa para os amantes de carne.",
        coupons = 10,
        rules = emptyList(),
        latitude = -23.5597423099191,
        longitude = -46.658148452498887,
        address = "Av. Paulista - Bela Vista",
        phone = "(11) 94567-1212",
        cover = "https://images.unsplash.com/photo-1498656309534-37a376d22a94?w=400&h=300"
    ),
    Market(
        id = "2bc11e34-5f30-4b40-90fa-c1c98f649281",
        categoryId = "146b1a88-b3d3-4232-8b8f-c1f006f1e86d",
        name = "Café Central",
        description = "Café aconchegante com opções de lanches e bebidas artesanais. Perfeito para um momento de descanso.",
        coupons = 10,
        rules = emptyList(),
        latitude = -23.5594571085044336,
        longitude = -46.66252581753144,
        address = "Alameda Jaú - Jardim Paulista",
        phone = "(12) 3456-7890",
        cover = "https://images.unsplash.com/photo-1551212154-8c4d1e887d22?w=400&h=300"
    )

)