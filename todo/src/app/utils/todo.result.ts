export class Todo {
    id: number;
    description: string;
    done: boolean;
    targetDate: Date;
    createdDate: Date;
    modifiedDate: Date;
}

export class SignUpRequest {
    name: string;
    username: string;
    email: string;
    password: string;
}