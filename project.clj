(defproject mixing-java-and-clojure "1.0.0-SNAPSHOT"
  :description "A simple demonstration of Java interop and build management using javac"
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :source-paths      ["src/clojure"]
  :java-source-paths ["src/java"]
  :main com.quephird.mjac.bar
  :aot [com.quephird.mjac.bar])
