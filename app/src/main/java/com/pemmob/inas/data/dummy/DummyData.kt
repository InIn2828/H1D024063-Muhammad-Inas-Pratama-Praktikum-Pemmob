package com.pemmob.inas.data.dummy

data class Category(
    val id: Int,
    val name: String,
    val description: String? = null,
    val products_count: Int? = null
)

data class Product(
    val id: Int,
    val name: String,
    val price: String, 
    val img: String,
    val categoryId: Int,
    val description: String? = null
)

object DummyData {
    val categories = listOf(
        Category(id = 1, name = "Makanan"),
        Category(id = 2, name = "Minuman"),
        Category(id = 3, name = "Kerajinan"),
        Category(id = 4, name = "Pakaian")
    )
    
    val products = listOf(
        Product(id = 1, name = "Mendoan", price = "Rp 15.000", img = "dummy_product", categoryId = 1),
        Product(id = 2, name = "Nopia", price = "Rp 25.000", img = "dummy_product", categoryId = 1),
        Product(id = 3, name = "Es Badeg", price = "Rp 5.000", img = "dummy_product", categoryId = 2),
        Product(id = 4, name = "Sapu Glagah", price = "Rp 20.000", img = "dummy_product", categoryId = 3),
        Product(id = 5, name = "Kaos Banyumasan", price = "Rp 50.000", img = "dummy_product", categoryId = 4)
    )
}
