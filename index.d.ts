declare module 'react-native-avishain-wix-onboarding' {
    export interface IToast {
        show(text: string): void
    }

    const MyToast: IToast;
    export default MyToast;
}