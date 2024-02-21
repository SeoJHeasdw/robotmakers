
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderOrderManager from "./components/listers/OrderOrderCards"
import OrderOrderDetail from "./components/listers/OrderOrderDetail"

import InstallDeliveryManager from "./components/listers/InstallDeliveryCards"
import InstallDeliveryDetail from "./components/listers/InstallDeliveryDetail"

import RobotInventoryManager from "./components/listers/RobotInventoryCards"
import RobotInventoryDetail from "./components/listers/RobotInventoryDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders/orders',
                name: 'OrderOrderManager',
                component: OrderOrderManager
            },
            {
                path: '/orders/orders/:id',
                name: 'OrderOrderDetail',
                component: OrderOrderDetail
            },

            {
                path: '/installs/deliveries',
                name: 'InstallDeliveryManager',
                component: InstallDeliveryManager
            },
            {
                path: '/installs/deliveries/:id',
                name: 'InstallDeliveryDetail',
                component: InstallDeliveryDetail
            },

            {
                path: '/robots/inventories',
                name: 'RobotInventoryManager',
                component: RobotInventoryManager
            },
            {
                path: '/robots/inventories/:id',
                name: 'RobotInventoryDetail',
                component: RobotInventoryDetail
            },



    ]
})
