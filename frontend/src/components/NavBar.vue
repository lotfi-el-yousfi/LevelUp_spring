<template>
  <nav class="bg-blue-600 p-4 shadow-md">
    <div class="container mx-auto flex justify-between items-center">
      <!-- Logo -->
      <router-link to="/" class="text-white text-2xl font-bold">MyApp</router-link>

      <!-- Navigation Links -->
      <div class="hidden md:flex space-x-6">
        <router-link to="/" class="nav-link">Home</router-link>
        <router-link to="/about" class="nav-link">About</router-link>
        <router-link to="/tickets" class="nav-link">Tickets</router-link>
        <router-link to="/login" class="nav-link">Login</router-link>
      </div>

      <!-- Mobile Menu Button -->
      <button @click="toggleMenu" class="md:hidden text-white">
        <svg class="w-6 h-6" fill="none" stroke="currentColor" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg">
          <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M4 6h16M4 12h16m-7 6h7"></path>
        </svg>
      </button>
    </div>

    <!-- Mobile Menu -->
    <div v-if="isMenuOpen" class="md:hidden bg-blue-700 p-4">
      <router-link to="/" class="block text-white py-2">Home</router-link>
      <router-link to="/about" class="block text-white py-2">About</router-link>
      <router-link to="/tickets" class="block text-white py-2">Tickets</router-link>
      <router-link to="/login" class="block text-white py-2">Login</router-link>
    </div>
  </nav>
</template>

<script>
import { ref } from "vue";

export default {
  setup() {
    const isMenuOpen = ref(false);

    const toggleMenu = () => {
      isMenuOpen.value = !isMenuOpen.value;
    };

    return { isMenuOpen, toggleMenu };
  },
};
</script>

<style>
.nav-link {
  @apply text-white text-lg font-medium hover:text-gray-300 transition duration-300;
}
</style>
