/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom.experimental.webrtc

import scala.scalajs.js

//https://www.w3.org/TR/2015/WD-webrtc-20150210/#idl-def-RTCStatsReport
@js.native
trait RTCStatsReport extends js.Object {
  def apply(id: String): RTCStats = js.native
}
