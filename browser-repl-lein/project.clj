(defproject browser-repl-lein "0.1.0"
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :plugins [[lein-cljsbuild "0.3.2"]]
  :cljsbuild
  {:builds
   [{:source-paths ["src/"]
     :compiler {:optimizations :none
                :pretty-print false
                :output-dir "out" 
                :output-to "out/main.js"}}]})
