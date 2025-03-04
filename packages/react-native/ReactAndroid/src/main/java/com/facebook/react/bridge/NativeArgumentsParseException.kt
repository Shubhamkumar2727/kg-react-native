/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.bridge

import com.facebook.react.common.annotations.internal.LegacyArchitecture

/** Exception thrown when a native module method call receives unexpected arguments from JS. */
@LegacyArchitecture
internal class NativeArgumentsParseException : JSApplicationCausedNativeException {

  constructor(detailMessage: String) : super(detailMessage)

  constructor(detailMessage: String, throwable: Throwable?) : super(detailMessage, throwable)
}
