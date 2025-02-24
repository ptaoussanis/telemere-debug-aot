(ns telemere-aot.core
  (:require [taoensso.telemere :as tel])
  (:gen-class))

(defn -main [& args]
  (println "Starting main")
  (tel/log! "Hello world")
  (tel/stop-handlers!)
  (println "Stopping main"))
