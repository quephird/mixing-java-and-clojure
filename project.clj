(defproject mixing-java-and-clojure "1.0.0-SNAPSHOT"
  :description "A simple demonstration of Java interop and build management using javac"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]]
  :source-path "src/clojure"
  :java-source-path "src/java"
  :java-options {:debug "true"}
  :main com.quephird.mjac.bar)
