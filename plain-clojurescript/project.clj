(defproject simple-lein "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :plugins [[lein-cljsbuild "0.3.2"]]
  :cljsbuild
  {:builds
   [{:source-paths ["src/simple_lein"]
     :compiler {:optimizations :none
                :pretty-print false
                :output-dir "out" 
                :output-to "out/main.js"}}]})
