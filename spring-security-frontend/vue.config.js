module.exports = {
    outputDir: "../src/main/resources/static",
    devServer: {
        proxy: {
            '/api': {
                target: 'http://localhost:7077',
                ws: true,
                changeOrigin: true
            }
        }
    }
}
