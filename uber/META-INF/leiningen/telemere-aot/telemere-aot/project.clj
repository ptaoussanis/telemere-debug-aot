(defproject telemere-aot "0.1.0-SNAPSHOT"
  :dependencies
    [[org.clojure/clojure   "1.12.0"]
     [com.taoensso/telemere "1.0.0-RC2"]]

  :main telemere-aot.core
  :profiles
  {:uberjar
   {:aot :all
    :uberjar-name "../uber.jar"}})
