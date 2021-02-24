<template>
    <div>
        <b-container>
            <h4>회원가입</h4>
            <b-form>
                <b-form-group
                    label="USER ID:"
                    label-for="input-1"
                >
                    <b-form-input
                        v-model="form.userId"
                        type="text"
                        placeholder="ID를 입력해주세요"
                        required
                    ></b-form-input>
                </b-form-group>

                <b-form-group id="input-group-2" label="USER NAME:" label-for="input-2">
                    <b-form-input
                        type="text"
                        v-model="form.userName"
                        placeholder="이름을 입력해주세요"
                        required
                    ></b-form-input>
                </b-form-group>

                <b-form-group id="input-group-3" label="USER PW:" label-for="input-3">
                    <b-form-input
                        v-model="form.userPw"
                        type="password"
                        placeholder="비밀번호를 입력해주세요"
                        required
                    ></b-form-input>
                </b-form-group>
                <b-button @click="onSubmit" variant="primary">Submit</b-button>
                <b-button @click="onReset" variant="danger">Reset</b-button>
            </b-form>
        </b-container>
    </div>
</template>

<script>
    import axios from 'axios';

    export default {
        data() {
            return {
                form: {
                    userId: '',
                    userName: '',
                    userPw: ''
                }
            }
        },
        methods: {
            async onSubmit() {
                try {
                    const result = await axios.post('/api/join', {
                        userId: this.form.userId,
                        userName: this.form.userName,
                        userPw: this.form.userPw
                    });

                    console.log(result)
                    // await this.$router.push({name: 'Login'})
                } catch (err) {
                    throw new Error(err);
                }
            },
            onReset() {
                this.form.userId = '';
                this.form.userName = '';
                this.form.userPw = '';
            }
        }
    }
</script>

<style scoped>

</style>
