/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.lunchtray.datasource

import com.example.lunchtray.model.MenuItem.AccompanimentItem
import com.example.lunchtray.model.MenuItem.EntreeItem
import com.example.lunchtray.model.MenuItem.SideDishItem

/**
 * Mapa de los artículos del menú disponibles para ser mostrados en los fragmentos del menú.
 */
object DataSource {

    val entreeMenuItems = listOf(
        EntreeItem(
            name = "Coliflor",
            description = "Coliflor entera, encurtida, asada y frita",
            price = 7.00,
        ),
        EntreeItem(
            name = "Chili de Tres Frijoles",
            description = "Frijoles negros, frijoles rojos, frijoles kidney, cocidos a fuego lento, cubiertos con cebolla",
            price = 4.00,
        ),
        EntreeItem(
            name = "Pasta de Champiñones",
            description = "Pasta penne, champiñones, albahaca, con tomates ciruela cocidos en ajo y aceite de oliva",
            price = 5.50,
        ),
        EntreeItem(
            name = "Sartén de Frijoles Negros Picantes",
            description = "Verduras de temporada, frijoles negros, mezcla de especias de la casa, servido con aguacate y cebollas encurtidas",
            price = 5.50,
        )
    )

    val sideDishMenuItems = listOf(
        SideDishItem(
            name = "Ensalada de Verano",
            description = "Tomates reliquia, lechuga mantequilla, duraznos, aguacate, aderezo balsámico",
            price = 2.50,
        ),
        SideDishItem(
            name = "Sopa de Calabaza",
            description = "Calabaza asada, pimientos asados, aceite de chile",
            price = 3.00,
        ),
        SideDishItem(
            name = "Papas Picantes",
            description = "Papas marmoladas, asadas y fritas con mezcla de especias de la casa",
            price = 2.00,
        ),
        SideDishItem(
            name = "Arroz con Coco",
            description = "Arroz, leche de coco, lima y azúcar",
            price = 1.50,
        )
    )

    val accompanimentMenuItems = listOf(
        AccompanimentItem(
            name = "Panecillo",
            description = "Panecillo fresco horneado en casa",
            price = 0.50,
        ),
        AccompanimentItem(
            name = "Bayas Mixtas",
            description = "Fresas, arándanos, frambuesas y arándanos azules",
            price = 1.00,
        ),
        AccompanimentItem(
            name = "Verduras Encurtidas",
            description = "Pepinos y zanahorias encurtidos, hechos en casa",
            price = 0.50,
        )
    )
}
