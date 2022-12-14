import { createRouter, createWebHashHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  },
  {
    path: '/index',
    name: 'Index',
    component: () => import( '../views/IndexView.vue')
  },
  {
    path: '/security/person',
    name: 'person',
    component: () => import( '../views/security/personView.vue')
  },
  {
    path: '/security/Role',
    name: 'role',
    component: () => import( '../views/security/RoleView.vue')
  },
  {
    path: '/security/users',
    name: 'users',
    component: () => import( '../views/security/usersView.vue')
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
