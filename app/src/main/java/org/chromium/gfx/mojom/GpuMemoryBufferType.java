
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/gfx/mojo/buffer_types.mojom
//

package org.chromium.gfx.mojom;

import org.chromium.mojo.bindings.DeserializationException;

public final class GpuMemoryBufferType {


    public static final int EMPTY_BUFFER = 0;

    public static final int SHARED_MEMORY_BUFFER = EMPTY_BUFFER + 1;

    public static final int IO_SURFACE_BUFFER = SHARED_MEMORY_BUFFER + 1;

    public static final int NATIVE_PIXMAP = IO_SURFACE_BUFFER + 1;

    public static final int DXGI_SHARED_HANDLE = NATIVE_PIXMAP + 1;

    public static final int ANDROID_HARDWARE_BUFFER = DXGI_SHARED_HANDLE + 1;


    private static final boolean IS_EXTENSIBLE = false;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value))
            return;

        throw new DeserializationException("Invalid enum value.");
    }

    private GpuMemoryBufferType() {}

}