(ns {{name}}.system
  (:require [{{name}}.web.server :as s]))

(defn system
  "Returns configuration for a new instance of the application"
  []
  {})

(defn start
  "Runs the application based on configuration."
  [system])

(defn stop
  "Stops a running instance fo the application"
  [system])

(defn -main
  [& [port]]
  (start (merge (system) {:port (Integer. port)})))
