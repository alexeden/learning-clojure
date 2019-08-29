(defproject learning-clojure "0.1.0-SNAPSHOT"
  :description "Giving Clojure a go."
  :url "https://github.com/alexeden/learning-clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]]
  :main ^:skip-aot learning-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
