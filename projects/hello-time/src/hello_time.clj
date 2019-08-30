(ns hello_time
  (:require [clj-time.core :as t]
            [clj-time.format :as f]))

(def formatter (f/formatter "h:m a"))

(defn time-string
  ([dt] (time-string dt (t/default-time-zone)))
  ([dt, tz] (as-> [tz] t
              (f/with-zone formatter tz)
              (f/unparse t dt))))

(defn -main []
  (println "Hello! It's currently" (time-string (t/now))))
