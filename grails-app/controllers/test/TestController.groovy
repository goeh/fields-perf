package test

class TestController {

    def index(TestCommand cmd) {
        if (request.get) {
            for (int i = 0; i < 10; i++) {
                cmd['s' + i] = i.toString()
                cmd['i' + i] = i
                cmd['b' + i] = i % 2
            }
        }
        [cmd: cmd]
    }
}
