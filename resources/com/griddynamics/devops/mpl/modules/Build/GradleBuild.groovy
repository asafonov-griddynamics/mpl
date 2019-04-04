/**
 * Simple Gradle Build
 */

withEnv(["PATH+GRADLE=${tool(CFG.'gradle.tool_version' ?: 'Gradle 5')}/bin"]) {
  sh """gradle build"""
}
