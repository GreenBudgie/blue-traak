import { fileURLToPath, URL } from 'url'

import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

// https://github.com/vuetifyjs/vuetify-loader/tree/next/packages/vite-plugin
import vuetify from 'vite-plugin-vuetify'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [
		vue(),
		vuetify({ autoImport: true, styles: "expose" }),
],
  mode: "development",
  server: {
    port: 8090,
    proxy: {
      '/api': {
        target: 'http://localhost:8091',
        changeOrigin: true
      },
    }
  }
})
