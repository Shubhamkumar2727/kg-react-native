# Copyright (c) Meta Platforms, Inc. and affiliates.
#
# This source code is licensed under the MIT license found in the
# LICENSE file in the root directory of this source tree.

cmake_minimum_required(VERSION 3.13)
set(CMAKE_VERBOSE_MAKEFILE on)

add_compile_options(-fexceptions -fno-omit-frame-pointer)

include(${REACT_COMMON_DIR}/cmake-utils/react-native-flags.cmake)

add_library(glog_init OBJECT glog_init.cpp)

target_include_directories(glog_init PUBLIC .)

target_link_libraries(glog_init log glog)
target_compile_reactnative_options(glog_init PRIVATE)
