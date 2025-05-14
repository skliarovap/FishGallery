package com.bluerose.fishgallery.data.local.repository

import com.bluerose.fishgallery.data.local.entity.FishCatchDetails
import com.bluerose.fishgallery.data.local.entity.StatisticsDetails

class StatisticsRepository() {
    fun getCommonStatistics(): StatisticsDetails {
        return StatisticsDetails(
            profit = 5400000,
            fishCatch = 108000000,
            partnerCount = 1500,
        )
    }

    fun getFishCatchStatistics(): List<FishCatchDetails> {
        return listOf<FishCatchDetails>(
            FishCatchDetails(
                fishName = "Призрачный дельфи",
                fishCatch = 50000000,
                imagePath = "file:///android_asset/App1_Image1.jpg"
            ),
            FishCatchDetails(
                fishName = "Алмазный ус",
                fishCatch = 48000000,
                imagePath = "file:///android_asset/App1_Image2.jpg"
            ),
            FishCatchDetails(
                fishName = "Шестиперая аку",
                fishCatch = 10000000,
                imagePath = "file:///android_asset/App1_Image3.jpg"
            )
        )
    }

}