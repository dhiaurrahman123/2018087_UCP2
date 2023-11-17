package com.example.pretemuan9.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.RadioButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pretemuan9.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanForm(
    onSelectionChanged:(String) -> Unit,
    onConfirmButtonClicked:(Int) -> Unit,
    onNextButtonClicker:()-> Unit,
    modifier: Modifier = Modifier
    ) {
    var nimMhs by rememberSaveable { mutableStateOf("") }
    var namaMhs by rememberSaveable { mutableStateOf("") }
    var konsentra by rememberSaveable { mutableStateOf("") }
    var jdlSkrip by rememberSaveable { mutableStateOf("") }

    Column(modifier = modifier, verticalArrangement = Arrangement.SpaceBetween)
    {
        OutlinedTextField(
            value = namaMhs,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.width(150.dp),
            label = {
                Text(text = "Nama Hamasiswa")
            },
            onValueChange = {
                namaMhs = it
            }
        )
        OutlinedTextField(
            value = nimMhs,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.width(150.dp),
            label = {
                Text(text = "NIM")
            },
            onValueChange = {
                nimMhs = it
            }
        )
        OutlinedTextField(
            value = konsentra,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.width(150.dp),
            label = {
                Text(text = "Konsentrasi")
            },
            onValueChange = {
                konsentra = it
            }
        )

    }
}