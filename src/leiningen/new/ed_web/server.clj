(ns {{name}}.web.server
  (:require [ring.adapter.jetty :as jetty]))

(defn create
  [hander & {:keys [port]}]
  (jetty/run-jetty handler {:port port :join? false}))

(defn stop
  [server]
  (.stop server))