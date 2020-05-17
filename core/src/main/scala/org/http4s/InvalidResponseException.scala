/*
 * Copyright 2013-2020 http4s.org
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package org.http4s

import scala.util.control.NoStackTrace

/** Exception dealing with invalid response
  * @param msg description if what makes the response invalid
  */
final case class InvalidResponseException(msg: String) extends Exception(msg) with NoStackTrace
