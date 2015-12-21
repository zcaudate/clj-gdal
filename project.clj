(defproject clj-gdal "0.1.0-SNAPSHOT"
  :description "GDAL for Clojure"
  :url "http://github.com/jmorton/clj-gdal"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.gdal/gdal "1.11.2"]
                 [nio "1.0.3"]]
  :repl-options {:init-ns clj-gdal.core})
