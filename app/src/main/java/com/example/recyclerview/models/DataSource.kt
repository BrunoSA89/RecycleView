package com.example.recyclerview.models

import com.example.recyclerview.R
import com.example.recyclerview.models.*

class DataSource {
    companion object {
        fun createDataSet() : ArrayList<Profile> {
            val list = ArrayList<Profile>()

            list.add(
                Profile(
                    "Kauê",
                    "Professor",
                    R.drawable.professor
                )
            )
            list.add(
                Profile(
                    "Bruno",
                    "Paz não é uma opção",
                    R.drawable.baphome
                )
            )
            list.add(
                Profile(
                    "Lucas",
                    "Gaúcho",
                    R.drawable.catatau
                )
            )
            list.add(
                Profile(
                    "Marianna",
                    "Normal",
                    R.drawable.sailormoon
                )
            )
            list.add(
                Profile(
                    "Maria",
                    "Praiera",
                    R.drawable.funeria
                )
            )
            return list
        }
    }
}
