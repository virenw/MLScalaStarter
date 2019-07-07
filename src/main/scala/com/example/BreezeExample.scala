/*
 * User: viren
 * Copyright (c) 2019.
 */

package com.example

import breeze.linalg.DenseMatrix

object BreezeExample extends App {

    val denseMatrix = DenseMatrix((1.0, 2.0), (3.0, 4.0))

    val dmTranspose = denseMatrix.t

    println(s"${denseMatrix}")
    println("transposed is ")
    println(s"${dmTranspose}")

}
