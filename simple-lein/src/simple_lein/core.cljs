(ns simple-lein.core
  (:require [simple-lein.world :as world])
)

(js/alert (world/default-string))