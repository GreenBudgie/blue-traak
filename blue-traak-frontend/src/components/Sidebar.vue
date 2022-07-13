<template>
  <v-navigation-drawer permanent="true">
    <v-list>
      <v-list-item
          :prepend-icon="logo"
      ></v-list-item>
    </v-list>
    <v-divider></v-divider>
    <v-list density="compact">
      <v-list-item title="Добавить Вещь"></v-list-item>
      <v-list-item title="Найти Вещь"></v-list-item>
    </v-list>
  </v-navigation-drawer>
</template>

<script lang="ts">
import { defineComponent } from 'vue'

import logo from '../assets/logo.svg'

export default defineComponent({
  name: 'Sidebar',

  data() {
    return {
      logo
    }
  }
})
</script>