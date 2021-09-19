package de.kp.works.akka.stream.ignite.impl
/*
 * Copyright (c) 20129 - 2021 Dr. Krusche & Partner PartG. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 * @author Stefan Krusche, Dr. Krusche & Partner PartG
 *
 */

import akka.annotation.InternalApi
import akka.stream.{Attributes, FlowShape}
import akka.stream.stage.{GraphStage, GraphStageLogic}
import de.kp.works.akka.stream.ignite.{IgniteWriteMessage, IgniteWriteSettings}

import scala.collection.immutable

/**
 * INTERNAL API
 */
@InternalApi
private[ignite] class IgniteFlowStage[T, C](settings: IgniteWriteSettings)
  extends GraphStage[FlowShape[immutable.Seq[IgniteWriteMessage[T, C]], immutable.Seq[IgniteWriteMessage[T, C]]]] {

  override def createLogic(inheritedAttributes: Attributes): GraphStageLogic = ???

  override def shape: FlowShape[immutable.Seq[IgniteWriteMessage[T, C]], immutable.Seq[IgniteWriteMessage[T, C]]] = ???

}
