package com.example.udemyapplication.di

import com.example.udemyapplication.model.CountriesService
import com.example.udemyapplication.viewmodel.ListViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: CountriesService)

    fun inject(viewModel : ListViewModel)

}