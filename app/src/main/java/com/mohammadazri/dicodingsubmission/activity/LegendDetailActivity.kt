package com.mohammadazri.dicodingsubmission.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.mohammadazri.dicodingsubmission.R

class LegendDetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_GENDER = "extra_gender"
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_HEIGHT = "extra_height"
        const val EXTRA_HOME = "extra_home"
        const val EXTRA_BIOGRAPHY = "extra_biography"
        const val EXTRA_SKILLT_IMAGE = "extra_skillt_image"
        const val EXTRA_SKILLP_IMAGE = "extra_skillp_image"
        const val EXTRA_SKILLU_IMAGE = "extra_skillu_image"
        const val EXTRA_SKILLT_NAME = "extra_skillt_name"
        const val EXTRA_SKILLP_NAME = "extra_skillp_name"
        const val EXTRA_SKILLU_NAME = "extra_skillu_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_legend_detail)
        supportActionBar?.title = "Halaman Detail"

        val imgLegendDetail: ImageView = findViewById(R.id.img_legend_detail)
        val tvLegendNameDetail: TextView = findViewById(R.id.tv_name_detail_value)
        val tvLegendGenderDetail: TextView = findViewById(R.id.tv_gender_detail_value)
        val tvLegendAgeDetail: TextView = findViewById(R.id.tv_age_detail_value)
        val tvLegendHeightDetail: TextView = findViewById(R.id.tv_height_detail_value)
        val tvLegendHomeDetail: TextView = findViewById(R.id.tv_home_detail_value)
        val tvLegendBiographyDetail: TextView = findViewById(R.id.tv_biography_detail_value)
        val imgLegendSkillT: ImageView = findViewById(R.id.img_skill_tactical)
        val imgLegendSkillP: ImageView = findViewById(R.id.img_skill_passive)
        val imgLegendSkillU: ImageView = findViewById(R.id.img_skill_ultimate)
        val tvLegendSkillT: TextView = findViewById(R.id.tv_tactical)
        val tvLegendSkillP: TextView = findViewById(R.id.tv_passive)
        val tvLegendSkillU: TextView = findViewById(R.id.tv_ultimate)

        val imgDetail = intent.getIntExtra(EXTRA_IMAGE, 0)
        val nameDetail = intent.getStringExtra(EXTRA_NAME)
        val genderDetail = intent.getStringExtra(EXTRA_GENDER)
        val ageDetail = intent.getStringExtra(EXTRA_AGE)
        val heightDetail = intent.getStringExtra(EXTRA_HEIGHT)
        val homeDetail = intent.getStringExtra(EXTRA_HOME)
        val biographyDetail = intent.getStringExtra(EXTRA_BIOGRAPHY)
        val imgSkillT = intent.getIntExtra(EXTRA_SKILLT_IMAGE, 0)
        val imgSkillP = intent.getIntExtra(EXTRA_SKILLP_IMAGE, 0)
        val imgSkillU = intent.getIntExtra(EXTRA_SKILLU_IMAGE, 0)
        val nameSkillT = intent.getStringExtra(EXTRA_SKILLT_NAME)
        val nameSkillP = intent.getStringExtra(EXTRA_SKILLP_NAME)
        val nameSkillU = intent.getStringExtra(EXTRA_SKILLU_NAME)

        imgLegendDetail.setImageResource(imgDetail)
        tvLegendNameDetail.text = nameDetail
        tvLegendGenderDetail.text = genderDetail
        tvLegendAgeDetail.text = ageDetail
        tvLegendHeightDetail.text = heightDetail
        tvLegendHomeDetail.text = homeDetail
        tvLegendBiographyDetail.text = biographyDetail
        imgLegendSkillT.setImageResource(imgSkillT)
        imgLegendSkillP.setImageResource(imgSkillP)
        imgLegendSkillU.setImageResource(imgSkillU)
        tvLegendSkillT.text = nameSkillT
        tvLegendSkillP.text = nameSkillP
        tvLegendSkillU.text = nameSkillU
    }
}