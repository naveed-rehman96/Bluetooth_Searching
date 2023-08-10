package com.navDroid.bluetoothchat.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.navDroid.bluetoothchat.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}