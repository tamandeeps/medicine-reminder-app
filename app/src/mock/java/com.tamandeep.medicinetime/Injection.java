package com.tamandeep.medicinetime;

import android.content.Context;
import androidx.annotation.NonNull;

import com.tamandeep.medicinetime.data.source.MedicineRepository;
import com.tamandeep.medicinetime.data.source.local.MedicinesLocalDataSource;


public class Injection {

    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}
