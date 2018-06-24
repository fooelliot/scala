package com.andy.rpc

import akka.actor.{Actor, ActorSystem, Props}
import com.typesafe.config.{Config, ConfigFactory}

/**
  * @author: Mr.ruoLin
  * @createBy: 2018-04-08 19:32
  **/
class Master extends Actor{

  println("constructor invoked")

  override def preStart(): Unit = {
    println("preStart invoked")
  }

  //用于接受消息
  override def receive : Receive = {
    case "connect" => {
      println("a client connected")
    }
    case "hello" => {
      println("hello")
    }
  }

}

object Master{

  def main(args: Array[String]): Unit = {
    //actorSystem老大 辅助创建和监控下面的Actor

    val host = args(0)
    val port = args(1).toInt

    val configStr =
      s"""
         |akka.actor.provider = "akka.remote.RemoteActorRefProvider"
         |akka.remote.netty.tcp.hostname = "$host"
         |akka.remote.netty.tcp.port = "$port"
       """.stripMargin

    val config = ConfigFactory.parseString(configStr);
    val actorSystem = ActorSystem("MasterSystem", config)

    val master = actorSystem.actorOf(Props(new Master), "Master")

    master ! "hello"


  }

}