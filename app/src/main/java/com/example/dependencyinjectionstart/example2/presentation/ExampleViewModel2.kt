package com.example.dependencyinjectionstart.example2.presentation

import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstart.example2.data.repository.ExampleRepositoryImpl
import com.example.dependencyinjectionstart.example2.domain.ExampleRepository
import com.example.dependencyinjectionstart.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel2 @Inject constructor(
    private val repository: ExampleRepository
): ViewModel() {

    fun method() {
        repository.method()
    }
}
